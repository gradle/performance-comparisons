package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_388 {
    private final Production95_388 production = new Production95_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}