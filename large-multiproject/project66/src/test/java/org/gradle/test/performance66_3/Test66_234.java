package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_234 {
    private final Production66_234 production = new Production66_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}