package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_168 {
    private final Production95_168 production = new Production95_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}