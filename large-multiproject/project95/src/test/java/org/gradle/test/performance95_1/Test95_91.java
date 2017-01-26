package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_91 {
    private final Production95_91 production = new Production95_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}