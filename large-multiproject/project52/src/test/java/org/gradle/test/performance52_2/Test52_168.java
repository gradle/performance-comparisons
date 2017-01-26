package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_168 {
    private final Production52_168 production = new Production52_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}