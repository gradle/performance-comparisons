package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_195 {
    private final Production52_195 production = new Production52_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}