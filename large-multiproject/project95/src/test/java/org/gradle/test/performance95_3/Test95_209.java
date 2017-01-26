package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_209 {
    private final Production95_209 production = new Production95_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}