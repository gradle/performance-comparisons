package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_445 {
    private final Production2_445 production = new Production2_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}