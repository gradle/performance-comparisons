package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_227 {
    private final Production2_227 production = new Production2_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}