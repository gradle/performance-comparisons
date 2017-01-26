package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_288 {
    private final Production95_288 production = new Production95_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}