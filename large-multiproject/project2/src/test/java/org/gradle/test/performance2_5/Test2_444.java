package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_444 {
    private final Production2_444 production = new Production2_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}