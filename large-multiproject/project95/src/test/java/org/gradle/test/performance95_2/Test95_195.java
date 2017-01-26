package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_195 {
    private final Production95_195 production = new Production95_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}