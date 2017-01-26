package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_166 {
    private final Production60_166 production = new Production60_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}