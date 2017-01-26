package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_432 {
    private final Production52_432 production = new Production52_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}