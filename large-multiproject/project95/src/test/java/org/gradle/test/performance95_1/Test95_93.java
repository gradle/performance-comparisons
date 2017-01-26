package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_93 {
    private final Production95_93 production = new Production95_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}