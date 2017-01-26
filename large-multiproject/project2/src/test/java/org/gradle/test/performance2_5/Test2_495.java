package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_495 {
    private final Production2_495 production = new Production2_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}