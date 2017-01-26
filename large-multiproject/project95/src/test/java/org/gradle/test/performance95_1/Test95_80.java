package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_80 {
    private final Production95_80 production = new Production95_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}