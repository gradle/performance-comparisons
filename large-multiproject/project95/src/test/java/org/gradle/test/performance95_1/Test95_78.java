package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_78 {
    private final Production95_78 production = new Production95_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}