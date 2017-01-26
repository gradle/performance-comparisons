package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_209 {
    private final Production2_209 production = new Production2_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}