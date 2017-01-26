package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_362 {
    private final Production2_362 production = new Production2_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}