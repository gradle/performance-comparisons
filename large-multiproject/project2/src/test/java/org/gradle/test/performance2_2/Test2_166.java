package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_166 {
    private final Production2_166 production = new Production2_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}