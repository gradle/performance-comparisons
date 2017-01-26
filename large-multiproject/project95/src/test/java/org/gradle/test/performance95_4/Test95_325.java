package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_325 {
    private final Production95_325 production = new Production95_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}