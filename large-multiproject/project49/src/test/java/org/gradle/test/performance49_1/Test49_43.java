package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_43 {
    private final Production49_43 production = new Production49_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}