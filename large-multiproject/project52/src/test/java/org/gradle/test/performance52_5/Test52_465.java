package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_465 {
    private final Production52_465 production = new Production52_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}