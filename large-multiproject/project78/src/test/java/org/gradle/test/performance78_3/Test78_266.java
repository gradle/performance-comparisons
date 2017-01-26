package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_266 {
    private final Production78_266 production = new Production78_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}