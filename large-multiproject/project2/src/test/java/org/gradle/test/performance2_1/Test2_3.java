package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_3 {
    private final Production2_3 production = new Production2_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}