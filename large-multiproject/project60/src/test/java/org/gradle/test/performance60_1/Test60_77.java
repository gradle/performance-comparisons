package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_77 {
    private final Production60_77 production = new Production60_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}