package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_58 {
    private final Production95_58 production = new Production95_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}