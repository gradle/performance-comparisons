package org.gradle.test.performance9_1;

import static org.junit.Assert.*;

public class Test9_43 {
    private final Production9_43 production = new Production9_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}