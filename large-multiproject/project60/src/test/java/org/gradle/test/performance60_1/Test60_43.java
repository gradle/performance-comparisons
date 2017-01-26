package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_43 {
    private final Production60_43 production = new Production60_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}