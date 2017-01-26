package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_362 {
    private final Production95_362 production = new Production95_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}