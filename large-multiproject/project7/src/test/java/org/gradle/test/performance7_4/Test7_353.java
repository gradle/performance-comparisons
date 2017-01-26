package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_353 {
    private final Production7_353 production = new Production7_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}