package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_207 {
    private final Production95_207 production = new Production95_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}