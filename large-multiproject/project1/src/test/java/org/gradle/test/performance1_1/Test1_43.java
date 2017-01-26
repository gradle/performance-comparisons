package org.gradle.test.performance1_1;

import static org.junit.Assert.*;

public class Test1_43 {
    private final Production1_43 production = new Production1_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}