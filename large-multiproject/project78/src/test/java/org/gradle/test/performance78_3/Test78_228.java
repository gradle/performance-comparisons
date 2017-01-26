package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_228 {
    private final Production78_228 production = new Production78_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}