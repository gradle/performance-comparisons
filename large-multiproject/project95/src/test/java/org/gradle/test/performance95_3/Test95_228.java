package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_228 {
    private final Production95_228 production = new Production95_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}