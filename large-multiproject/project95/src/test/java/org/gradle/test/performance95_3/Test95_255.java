package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_255 {
    private final Production95_255 production = new Production95_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}