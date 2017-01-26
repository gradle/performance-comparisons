package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_75 {
    private final Production2_75 production = new Production2_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}