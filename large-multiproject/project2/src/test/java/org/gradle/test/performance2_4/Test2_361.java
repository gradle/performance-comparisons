package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_361 {
    private final Production2_361 production = new Production2_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}