package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_107 {
    private final Production2_107 production = new Production2_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}