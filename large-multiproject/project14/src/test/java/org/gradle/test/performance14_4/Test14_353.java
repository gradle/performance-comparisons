package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_353 {
    private final Production14_353 production = new Production14_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}