package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_89 {
    private final Production95_89 production = new Production95_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}