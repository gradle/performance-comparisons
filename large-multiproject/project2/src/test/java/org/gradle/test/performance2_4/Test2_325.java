package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_325 {
    private final Production2_325 production = new Production2_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}