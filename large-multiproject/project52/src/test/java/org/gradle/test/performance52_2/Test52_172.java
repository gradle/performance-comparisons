package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_172 {
    private final Production52_172 production = new Production52_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}