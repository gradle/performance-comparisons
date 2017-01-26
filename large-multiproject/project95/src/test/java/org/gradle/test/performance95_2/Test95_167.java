package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_167 {
    private final Production95_167 production = new Production95_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}