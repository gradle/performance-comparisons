package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_289 {
    private final Production64_289 production = new Production64_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}