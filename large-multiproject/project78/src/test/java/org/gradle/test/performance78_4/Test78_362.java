package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_362 {
    private final Production78_362 production = new Production78_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}