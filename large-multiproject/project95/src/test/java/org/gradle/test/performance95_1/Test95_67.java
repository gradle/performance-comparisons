package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_67 {
    private final Production95_67 production = new Production95_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}