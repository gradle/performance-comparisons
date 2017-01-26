package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_77 {
    private final Production74_77 production = new Production74_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}