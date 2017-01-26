package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_474 {
    private final Production2_474 production = new Production2_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}