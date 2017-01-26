package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_406 {
    private final Production52_406 production = new Production52_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}