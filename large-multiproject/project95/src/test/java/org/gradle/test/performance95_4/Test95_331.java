package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_331 {
    private final Production95_331 production = new Production95_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}