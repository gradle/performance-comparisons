package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_166 {
    private final Production95_166 production = new Production95_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}