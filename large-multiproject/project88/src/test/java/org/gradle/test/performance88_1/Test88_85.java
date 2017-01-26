package org.gradle.test.performance88_1;

import static org.junit.Assert.*;

public class Test88_85 {
    private final Production88_85 production = new Production88_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}