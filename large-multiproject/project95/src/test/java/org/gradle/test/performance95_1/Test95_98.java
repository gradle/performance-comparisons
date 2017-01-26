package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_98 {
    private final Production95_98 production = new Production95_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}