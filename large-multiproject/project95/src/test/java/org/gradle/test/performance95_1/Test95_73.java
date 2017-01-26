package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_73 {
    private final Production95_73 production = new Production95_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}