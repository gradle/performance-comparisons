package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_112 {
    private final Production2_112 production = new Production2_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}