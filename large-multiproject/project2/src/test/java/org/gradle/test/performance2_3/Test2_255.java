package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_255 {
    private final Production2_255 production = new Production2_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}